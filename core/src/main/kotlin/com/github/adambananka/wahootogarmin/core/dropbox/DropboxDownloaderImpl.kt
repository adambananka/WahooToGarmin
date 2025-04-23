package com.github.adambananka.wahootogarmin.core.dropbox

import com.dropbox.core.DbxRequestConfig
import com.dropbox.core.v2.DbxClientV2
import java.io.ByteArrayOutputStream

class DropboxDownloaderImpl(accessToken: String) : DropboxDownloader {

    private val client: DbxClientV2

    init {
        val config = DbxRequestConfig.newBuilder(APP_ID).build()
        client = DbxClientV2(config, accessToken)
    }

    override fun get(name: String): ByteArrayOutputStream {
        val file = ByteArrayOutputStream()
        client.files().download(BASE_PATH + name).download(file)
        return file
    }

    override fun getLatest(): ByteArrayOutputStream {
        val metadata = client.files().listFolder(BASE_PATH).entries.last()
        return get(metadata.name)
    }

    override fun listFiles(): List<String> {
        return client.files()
            .listFolder(BASE_PATH)
            .entries
            .map{ metadata -> metadata.name }
    }

    companion object {
        private const val APP_ID: String = "adambananka-WahooToGarmin"
        private const val BASE_PATH: String = "/Apps/WahooFitness/"
    }
}
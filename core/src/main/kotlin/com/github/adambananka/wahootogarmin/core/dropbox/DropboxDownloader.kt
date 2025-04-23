package com.github.adambananka.wahootogarmin.core.dropbox

import java.io.ByteArrayOutputStream

interface DropboxDownloader {

    fun get(name: String): ByteArrayOutputStream

    fun getLatest(): ByteArrayOutputStream

    fun listFiles() : List<String>
}
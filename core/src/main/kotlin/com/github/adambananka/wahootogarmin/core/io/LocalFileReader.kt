package com.github.adambananka.wahootogarmin.core.io

import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream

class LocalFileReader : FileReader {

    override fun loadFile(path: String): FileInputStream {
        return File(path).inputStream()
    }

    override fun loadFileBuffered(path: String): BufferedReader {
        return File(path).bufferedReader()
    }

    override fun loadFileLines(path: String): List<String> {
        return File(path).readLines()
    }
}
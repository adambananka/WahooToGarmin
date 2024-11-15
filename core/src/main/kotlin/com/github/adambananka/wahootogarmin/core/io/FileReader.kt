package com.github.adambananka.wahootogarmin.core.io

import java.io.BufferedReader
import java.io.FileInputStream

interface FileReader {

    fun loadFile(path: String): FileInputStream

    fun loadFileBuffered(path: String): BufferedReader

    fun loadFileLines(path: String): List<String>
}
package cz.whadoo.connectgov.service

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import cz.whadoo.connectgov.model.Municipality
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody
import java.io.File
import jdk.nashorn.internal.runtime.ScriptingFunctions.readLine
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*


@Service
class MunicipalityService(val objectMapper: ObjectMapper) {
    val JSON_FILE_NAME = "/home/pavel/Downloads/rawdata.json"
    val TMP_FILE = "/tmp/connectgov.json"
    val RESULT_JSON = "/run/user/1000/gvfs/dav:host=apps.corpismaps.com,ssl=true,prefix=%2Fcorpis%2Fcz-hackprague%2Fb73598744e8bb41b03685cf53f008fe2%2Fdav/app/connectgov/data/rawdata/rawdata.json"
    val PYTHON_FILE = "/home/pavel/Downloads/production.py"
    val DATABASE_JSON = "/home/pavel/Downloads/database.json"

    fun getMunicipalities(): List<Municipality> {
        var jsonFile = ""

        return objectMapper.readValue(File(JSON_FILE_NAME), object : TypeReference<List<Municipality>>() {})
    }

    fun saveMunicipalities(municipalities: List<Municipality>) {
        objectMapper.writeValue(File(JSON_FILE_NAME), municipalities)
    }

    fun queue(data: Map<String, Any>) {
        objectMapper.writeValue(File(TMP_FILE), data)
        val queue = listOf("python3", PYTHON_FILE, TMP_FILE, RESULT_JSON, DATABASE_JSON)
//        val queue = listOf("/home/pavel/Downloads/magic.sh")
//        val queue = listOf("touch", RESULT_JSON)
        println("Started $queue")
//        ProcessBuilder("/home/pavel/Downloads/magic.sh").start().waitFor()
//        ProcessBuilder(queue).start().waitFor()
        val process = ProcessBuilder(queue).start()
//        val res = Runtime.getRuntime().exec(queue)

        val ist = process.inputStream
        val isr = InputStreamReader(ist)
        val br = BufferedReader(isr)
        var line: String?
        line = br.readLine()

        while (line != null) {
            println(line)
            line = br.readLine()
        }


        println("Finished $queue")
    }
}

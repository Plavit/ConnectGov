package cz.whadoo.connectgov

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConnectGovApplication

fun main(args: Array<String>) {
    runApplication<ConnectGovApplication>(*args)
}

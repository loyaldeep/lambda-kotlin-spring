package com.aws

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AwsLambdaClass

  fun main(args: Array<String>) {
    runApplication<AwsLambdaClass>(*args)
  }

package com.freekeer.utils

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by WuWei on 2016/12/9.
  */
object ScUtils {
  def getSparkContext():SparkContext = {
    new SparkContext(new SparkConf())
  }
}

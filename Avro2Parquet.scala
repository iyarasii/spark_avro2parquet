package com.freekeer.data


import com.freekeer.utils.{ScUtils}
import org.apache.spark.sql.SQLContext
import com.databricks.spark.avro._


/**
  * avro to parquet
  */
object Avro2Parquet {

  def main(args: Array[String]) {
    val sc = ScUtils.getSparkContext()
    val sqlContext = new SQLContext(sc)
    val df = sqlContext.read.avro("hdfs://hdp01/maqiang/ma/avrofile1/ymd=2016-12-23")

    sqlContext.setConf("spark.sql.parquet.compression.codec","snappy")
    df.write.parquet("hdfs://hdp01/maqiang/ma/parquetfile5/")

    sc.stop()
  }

}

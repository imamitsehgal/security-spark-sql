import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.hive.thriftserver.HiveThriftServer2

/**
  * Created by amisehga on 4/9/2018.
  */
object Thrift extends App{

  val session = SparkSession.builder().master("local[*]")
                              .appName("Thrift")
                                .enableHiveSupport().config("hive.server2.thrift.port","9099")
    .getOrCreate()


  HiveThriftServer2.startWithContext(session.sqlContext)

}

// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/PCC/tutorial/play-scala-rest-api-example-master/conf/routes
// @DATE:Tue Jul 19 15:42:32 CEST 2022


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

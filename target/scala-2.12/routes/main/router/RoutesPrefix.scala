// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/HP/Desktop/dlp-test/conf/routes
// @DATE:Tue Oct 08 15:35:50 CEST 2019


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

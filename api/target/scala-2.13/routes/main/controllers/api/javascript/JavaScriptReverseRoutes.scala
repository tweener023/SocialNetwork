// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/PCC/tutorial/play-scala-rest-api-example-master/conf/routes
// @DATE:Tue Jul 19 15:42:32 CEST 2022

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:13
package controllers.api.javascript {

  // @LINE:13
  class ReverseTodoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.TodoController.delete",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/todos/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:16
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.TodoController.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/todos/update/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:13
    def getAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.TodoController.getAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/todos"})
        }
      """
    )
  
    // @LINE:15
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.TodoController.add",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/todos/add"})
        }
      """
    )
  
    // @LINE:14
    def getById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.TodoController.getById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/todos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}

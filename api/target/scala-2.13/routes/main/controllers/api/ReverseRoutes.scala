// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/PCC/tutorial/play-scala-rest-api-example-master/conf/routes
// @DATE:Tue Jul 19 15:42:32 CEST 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:13
package controllers.api {

  // @LINE:13
  class ReverseTodoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def delete(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/todos/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:16
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/todos/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:13
    def getAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/todos")
    }
  
    // @LINE:15
    def add(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/todos/add")
    }
  
    // @LINE:14
    def getById(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/todos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }


}

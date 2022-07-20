// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/PCC/tutorial/play-scala-rest-api-example-master/conf/routes
// @DATE:Tue Jul 19 15:42:32 CEST 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_2: controllers.HomeController,
  // @LINE:10
  Assets_1: controllers.Assets,
  // @LINE:13
  TodoController_0: controllers.api.TodoController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_2: controllers.HomeController,
    // @LINE:10
    Assets_1: controllers.Assets,
    // @LINE:13
    TodoController_0: controllers.api.TodoController
  ) = this(errorHandler, HomeController_2, Assets_1, TodoController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, Assets_1, TodoController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todos""", """controllers.api.TodoController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todos/""" + "$" + """id<[^/]+>""", """controllers.api.TodoController.getById(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todos/add""", """controllers.api.TodoController.add"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todos/update/""" + "$" + """id<[^/]+>""", """controllers.api.TodoController.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todos/delete/""" + "$" + """id<[^/]+>""", """controllers.api.TodoController.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_api_TodoController_getAll2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todos")))
  )
  private[this] lazy val controllers_api_TodoController_getAll2_invoker = createInvoker(
    TodoController_0.getAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.TodoController",
      "getAll",
      Nil,
      "GET",
      this.prefix + """api/todos""",
      """  api controllers mapping""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_api_TodoController_getById3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_TodoController_getById3_invoker = createInvoker(
    TodoController_0.getById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.TodoController",
      "getById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/todos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_api_TodoController_add4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todos/add")))
  )
  private[this] lazy val controllers_api_TodoController_add4_invoker = createInvoker(
    TodoController_0.add,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.TodoController",
      "add",
      Nil,
      "POST",
      this.prefix + """api/todos/add""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_api_TodoController_update5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todos/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_TodoController_update5_invoker = createInvoker(
    TodoController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.TodoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """api/todos/update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_api_TodoController_delete6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todos/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_TodoController_delete6_invoker = createInvoker(
    TodoController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.TodoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/todos/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:10
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_api_TodoController_getAll2_route(params@_) =>
      call { 
        controllers_api_TodoController_getAll2_invoker.call(TodoController_0.getAll)
      }
  
    // @LINE:14
    case controllers_api_TodoController_getById3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_api_TodoController_getById3_invoker.call(TodoController_0.getById(id))
      }
  
    // @LINE:15
    case controllers_api_TodoController_add4_route(params@_) =>
      call { 
        controllers_api_TodoController_add4_invoker.call(TodoController_0.add)
      }
  
    // @LINE:16
    case controllers_api_TodoController_update5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_api_TodoController_update5_invoker.call(TodoController_0.update(id))
      }
  
    // @LINE:17
    case controllers_api_TodoController_delete6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_api_TodoController_delete6_invoker.call(TodoController_0.delete(id))
      }
  }
}

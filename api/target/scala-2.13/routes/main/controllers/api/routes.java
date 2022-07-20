// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/PCC/tutorial/play-scala-rest-api-example-master/conf/routes
// @DATE:Tue Jul 19 15:42:32 CEST 2022

package controllers.api;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.api.ReverseTodoController TodoController = new controllers.api.ReverseTodoController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.api.javascript.ReverseTodoController TodoController = new controllers.api.javascript.ReverseTodoController(RoutesPrefix.byNamePrefix());
  }

}

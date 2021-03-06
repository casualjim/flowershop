package com.futurechimps.swagger.sample

import org.scalatra.test.specs2._

// For more on Specs2, see http://etorreborre.github.com/specs2/guide/org.specs2.guide.QuickStart.html 
class FlowersSpec extends ScalatraSpec { def is =
  "GET / on Flowers"                     ^
    "should return status 200"                  ! root200^
                                                end
  implicit val swagger = new FlowersSwagger  
  addServlet(new FlowersController, "/*")

  def root200 = get("/") { 
    status must_== 200
  }
}

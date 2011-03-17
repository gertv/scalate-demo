/**
 * Copyright (C) 2009-2011 the original author or authors.
 * See the notice.md file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package be.anova.scalate.jaxrs.resources

import com.sun.jersey.api.view.ImplicitProduces
import javax.ws.rs.{GET, Path, Produces}

@Path("/sample")
@ImplicitProduces(Array("text/html;qs=5"))
class SampleResource {

  // TODO delete me:
  // this is just some dummy data we can use in a template
  def name = "Some Name"

  println("Creating the resource")

  @GET
  def get = Sample("getting")

}

case class Sample(val init: String)

package sri.web

import sri.core.ReactElement

import scala.scalajs.js

@js.native
object ReactTestUtils  extends js.Object{

  val Simulate : js.Dynamic = js.native

  def renderIntoDocument(instance : ReactElement) : js.Dynamic = js.native

  def isElement(element : ReactElement) : Boolean = js.native

}

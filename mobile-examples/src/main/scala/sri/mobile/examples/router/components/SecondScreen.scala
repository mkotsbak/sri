package sri.mobile.examples.router.components

import sri.core.ElementFactory._
import sri.core.{ReactComponent, ReactElement}
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object SecondScreen {

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    override def render(): ReactElement = View(style = styles.container)(
      Text()("Second screen ")
    )

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply() = createElementNoProps(ctor)
}


package sri.mobile

import sri.core._
import sri.mobile.apis._
import sri.mobile.modules.NativeModules
import sri.universal.ReactUniversal

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait ReactNative extends ReactUniversal {


  //components
  val ActivityIndicatorIOS: ReactClass = js.native
  val DatePickerIOS: ReactClass = js.native
  val MapView: ReactClass = js.native
  val NavigatorIOS: ReactClass = js.native
  val SliderIOS: ReactClass = js.native
  val SwitchIOS: ReactClass = js.native
  val TabBarItemIOS: ReactClass = js.native
  val WebView: ReactClass = js.native
  val TabBarIOS: ReactClass = js.native
  val SegmentedControlIOS: ReactClass = js.native
  val DrawerLayoutAndroid: ReactClass = js.native
  val ProgressBarAndroid: ReactClass = js.native
  val SwitchAndroid: ReactClass = js.native
  val ToolbarAndroid: ReactClass = js.native
  val TouchableNativeFeedback: ReactClass = js.native


  // apis

  val AlertIOS: AlertIOS = js.native
  val AppRegistry: AppRegistry = js.native
  val StyleSheet: StyleSheet = js.native
  val AppStateIOS: AppStateIOS = js.native
  val CameraRoll: CameraRoll = js.native
  val InteractionManager: InteractionManager = js.native
  val LinkingIOS: LinkingIOS = js.native
  val NetInfo: NetInfo = js.native
  val LayoutAnimation: js.Dynamic = js.native
  val PushNotificationIOS: PushNotificationIOS = js.native
  val PanResponder: PanResponder = js.native
  val StatusBarIOS: js.Dynamic = js.native
  val VibrationIOS: VibrationIOS = js.native
  val Dimensions: js.Dynamic = js.native

  // native stuff
  val NativeModules: NativeModules = js.native


}

@js.native
trait ReactPlatForm extends js.Object {
  val OS: String = js.native
  val Version: Double = js.native
}

@js.native
@JSName("React")
object ReactNative extends ReactNative


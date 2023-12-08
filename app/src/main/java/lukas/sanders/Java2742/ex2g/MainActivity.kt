//package lukas.sanders.Java2742.ex2g
//
//import android.os.Bundle
//import android.widget.TextView
//import androidx.activity.ComponentActivity
//
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import lukas.sanders.Java2742.ex2g.ui.theme.Ex2gTheme
//
//public class MainActivity : ComponentActivity() {
//    private lateinit TextView sensorReadingIdTextView;
//    private lateinit TextView dateTimeTextView;
//    private lateinit TextView valueTextView;
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main);
//
//        this.sensorReadingIdTextView = (TextView) findViewById(R.id.sensorReadingIdTextView);
//        this.dateTimeTextView = (TextView) findViewById(R.id.dateTimeTextView);
//
////        setContent {
//////            R.layout.activity_main
////            Ex2gTheme {
////                Surface() {
////                    R.layout.activity_main
////                }
////            }
////        }
////        setContent {
////            Ex2gTheme {
////                // A surface container using the 'background' color from the theme
////                Surface(
////                    modifier = Modifier.fillMaxSize(),
////                    color = MaterialTheme.colorScheme.background
////                ) {
////                    Greeting("Android")
////                }
////            }
////        }
//    }
//}
//
////@Composable
////fun Greeting(name: String, modifier: Modifier = Modifier) {
////    Text(
////        text = "Hello $name!",
////        modifier = modifier
////    )
////}
////
////@Preview(showBackground = true)
////@Composable
////fun GreetingPreview() {
////    Ex2gTheme {
////        Greeting("Android")
////    }
////}
<<<<<<< HEAD
# react-native-mapintent

A React Native intent for Android Facebook App.

### Installation

```bash
npm install --save react-native-fbintent
```

### Add it to your android project

* In `android/setting.gradle`

```gradle
...
include ':RNFbIntent', ':app'
project(':RNFbIntent').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-fbintent')
```

* In `android/app/build.gradle`

```gradle
...
dependencies {
    ...
    compile project(':RNFbIntent')
}
```

* register module (in MainActivity.java)

```java
import com.syarul.fbintent.RNFbIntentPackage;  // <--- import

public class MainActivity extends Activity implements DefaultHardwareBackBtnHandler {
  ......

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mReactRootView = new ReactRootView(this);

    mReactInstanceManager = ReactInstanceManager.builder()
      .setApplication(getApplication())
      .setBundleAssetName("index.android.bundle")
      .setJSMainModuleName("index.android")
      .addPackage(new MainReactPackage())
      .addPackage(new RNFbIntentPackage())              // <------ add here
      .setUseDeveloperSupport(BuildConfig.DEBUG)
      .setInitialLifecycleState(LifecycleState.RESUMED)
      .build();

    mReactRootView.startReactApplication(mReactInstanceManager, "ExampleRN", null);

    setContentView(mReactRootView);
  }

  ......

}
```

## Example

FbIntent.open(facebook_page_id)

* **facebook_page_id:** *(string)* facebook page id, use http://findmyfbid.com/ to find the id of a page. If user does not install facebook app it will open facebook page in the browser.

Example:

```javascript
var FbIntent = require('react-native-fbintent');

FbIntent.open('461828740557560');
```
## License

MIT
=======
# react-native-fbintent
A React Native intent for Android Facebook App
>>>>>>> 52ee314e2afe430f07554e66852440fa58c371a3

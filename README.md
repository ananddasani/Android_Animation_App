# Android_Animation_App
An App With Lots of Animation Used on Different Activityes


# App Highlight

<img src="app_images/Animation Code.png" width="1000" /><br>

<!-- <img src="app_images/Animation PlayBack.mp4" width="300" /><br> -->

![](https://github.com/ananddasani/Android_Animation_App/blob/main/app_images/Animation%20PlayBack.gif)

# Code

#### splashActivity.java 
```
        //remove Actionbar
        getSupportActionBar().hide();

        //hide status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Splash screen working
        Thread thread = new Thread(){

            public void run() {
                try {
                    sleep(5000);
                }catch (Exception exception){
                    exception.printStackTrace();
                }finally {
                    Intent intent = new Intent(splashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        thread.start();
```

#### activity_splash.xml
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".splashActivity">

    <com.airbnb.lottie.LottieAnimationView
        android:id="@+id/animation_view"
        android:layout_width="0dp"
        android:layout_height="400dp"

        android:layout_marginTop="48dp"

        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:lottie_autoPlay="true"
        app:lottie_loop="true"
        app:lottie_rawRes="@raw/cycleanimation" />

    <com.airbnb.lottie.LottieAnimationView
        android:id="@+id/animation_text"
        android:layout_width="0dp"
        android:layout_height="300dp"

        android:layout_marginTop="50dp"
        app:layout_constraintBottom_toBottomOf="@+id/animation_view"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/animation_view"
        app:lottie_autoPlay="true"
        app:lottie_loop="true"
        app:lottie_rawRes="@raw/loadinganimation" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

#### MainActivity.java 
```
Button button;
LottieAnimationView animationView;

        //hide action bar
        getSupportActionBar().hide();

        //hide status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        button = findViewById(R.id.button);
        animationView = findViewById(R.id.splash_animation);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //see the animation to full screen
                animationView.setVisibility(View.VISIBLE);

                //now hide the button
                button.setVisibility(View.GONE);

                //play the animation
                animationView.playAnimation();

                //animation for how many time (Splash)
                //Splash screen working
                Thread thread = new Thread(){

                    public void run() {
                        try {
                            sleep(4000);
                        }catch (Exception exception){
                            exception.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    }
                };
                thread.start();
            }
        });
```

#### activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Click Here"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <com.airbnb.lottie.LottieAnimationView
        android:id="@+id/splash_animation"
        android:layout_width="match_parent"
        android:layout_height="match_parent"

        android:scaleType="centerCrop"
        android:visibility="gone"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:lottie_autoPlay="true"
        app:lottie_loop="false"
        app:lottie_rawRes="@raw/spaceanimation" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

#### DetailActivity.java
```
        //hide action bar
        getSupportActionBar().hide();

        //hide status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
```

#### activity_detail.xml
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".DetailActivity">

    <com.airbnb.lottie.LottieAnimationView
        android:id="@+id/splash_animation"
        android:layout_width="match_parent"
        android:layout_height="match_parent"

        android:scaleType="centerCrop"

        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:lottie_autoPlay="true"
        app:lottie_loop="true"
        app:lottie_rawRes="@raw/rocketanimation" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

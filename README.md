MaterialWidget
==============

Android L design widget in Android 4.0 ~ 4.4.

## TabIndicator ##
Thank [PagerSlidingTabStrip](https://github.com/astuetz/PagerSlidingTabStrip) for giving me some inspiration!

### Screenshot ###

![Imgur](http://i.imgur.com/TdG2i7L.png)

### Usage ###

```xml
<com.material.widget.TabIndicator
    android:id="@+id/indicator"
    android:background="@color/primary_color"
    android:layout_width="match_parent"
    android:layout_height="50dp"/>
```

### Attribute ###

```xml
<attr name="text_size" format="dimension"/>
<attr name="text_color" format="color"/>
<attr name="text_selected_color" format="color"/>
<attr name="text_disabled_color" format="color"/>
<attr name="ripple_color" format="color"/>
<attr name="underline_color" format="color"/>
<attr name="underline_height" format="dimension"/>
<attr name="max_column" format="integer"/>
```

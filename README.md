MaterialWidget
==============

Android L design widget in Android 4.0 ~ 4.4.

## Screenshot ##

![Imgur](http://i.imgur.com/4uT2SRw.png)

## TabIndicator ##
Thank [PagerSlidingTabStrip](https://github.com/astuetz/PagerSlidingTabStrip) for giving me some inspiration!

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

## CircleButton ##

### Usage ###

```xml
<com.material.widget.CircleButton
    android:id="@+id/circle_button"
    widget:circle_icon="@drawable/ic_add"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

### Attribute ###

```xml
<attr name="circle_icon" format="reference"/>
<attr name="circle_color" format="color"/>
<attr name="circle_shadow_radius" format="float"/>
<attr name="circle_shadow_offset_x" format="float"/>
<attr name="circle_shadow_offset_y" format="float"/>
<attr name="circle_shadow_color" format="color"/>
```

## PaperButton ##

### Usage ###

```xml
<com.material.widget.PaperButton
    widget:paper_text="Paper Button"
    android:layout_width="160dp"
    android:layout_height="54dp"/>
```

### Attribute ###
```xml
<attr name="paper_text" format="string"/>
<attr name="paper_text_size" format="dimension"/>
<attr name="paper_text_color" format="color"/>
<attr name="paper_font" format="string"/>
<attr name="paper_color" format="color"/>
<attr name="paper_corner_radius" format="dimension"/>
<attr name="paper_shadow_radius" format="float"/>
<attr name="paper_shadow_offset_x" format="float"/>
<attr name="paper_shadow_offset_y" format="float"/>
<attr name="paper_shadow_color" format="color"/>
```
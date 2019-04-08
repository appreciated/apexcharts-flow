package com.github.appreciated.apexcharts.entity.animations;

public class Animations {
    Boolean enabled;
    Easing easing;
    enum Easing {
        linear("linear"),
        easein("easein"),
        easeout("easeout"),
        easeinout("easeinout");
        private String name;
        Easing(String name){
            this.name = name;
        }
    }
    Number speed;
    AnimateGradually animateGradually;
    class AnimateGradually {
        Boolean enabled;
        Number delay;
    }
    DynamicAnimation dynamicAnimation;
    class DynamicAnimation {
        Boolean enabled;
        Number speed;
    }
}

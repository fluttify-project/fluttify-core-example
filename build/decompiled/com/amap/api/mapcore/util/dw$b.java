package com.amap.api.mapcore.util;

import android.opengl.GLES20;

public class dw$b extends dv {
   String a = "precision highp float;\n        attribute vec3 aVertex;//顶点数组,三维坐标\n        attribute vec2 aTexture;\n        uniform mat4 aMVPMatrix;//mvp矩阵\n        varying vec2 texture;//\n        void main(){\n            gl_Position = aMVPMatrix * vec4(aVertex, 1.0);\n            texture = aTexture;\n        }";
   String b = "        precision highp float;\n        varying vec2 texture;//\n        uniform sampler2D aTextureUnit0;//纹理id\n        void main(){\n            gl_FragColor = texture2D(aTextureUnit0, texture);\n        }";
   public int c;
   public int g;
   public int h;

   public dw$b() {
      if (this.a(this.a, this.b)) {
         this.c = GLES20.glGetAttribLocation(this.d, "aVertex");
         this.h = GLES20.glGetAttribLocation(this.d, "aTexture");
         this.g = GLES20.glGetUniformLocation(this.d, "aMVPMatrix");
      }
   }
}

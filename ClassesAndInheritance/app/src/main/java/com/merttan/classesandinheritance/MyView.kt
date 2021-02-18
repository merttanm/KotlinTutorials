package com.merttan.classesandinheritance

import android.content.Context
import android.util.AttributeSet
import android.view.View

// Inheritance
class MyView : View {
    constructor(ctx :Context):super(ctx)
    constructor(ctx: Context,attrs :AttributeSet) :super (ctx,attrs)
}
/*
  Türetilen sınıfın bir birincil kurucusu varsa,
  temel sınıf, birincil kurucunun parametreleri kullanılarak burada başlatılabilir.

  Türetilmiş sınıfın birincil kurucusu yoksa,
  her ikincil kurucunun süper anahtar sözcüğünü kullanarak temel türü başlatması gerekir,*/
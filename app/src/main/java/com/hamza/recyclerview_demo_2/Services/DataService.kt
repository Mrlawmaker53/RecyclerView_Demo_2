package com.hamza.recyclerview_demo_2.Services

import com.hamza.recyclerview_demo_2.Model.Category
import com.hamza.recyclerview_demo_2.Model.Product

object DataService {
    val categories=listOf(Category("SHIRTS","shirtimage"),
        Category("HODDIES","hoddieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )
    val hats=listOf(
        Product("Devslops Graphic Beanie","$18","hat01"),
        Product("Devslops Hat Black","$20","hat02"),
        Product("Devslops Hat White","$22","hat03"),
        Product("Devslops Hat Snapback","$18","hat04")
    )
    val hodies=listOf(
        Product("Devslops Graphic Beanie","$18","hoodie1"),
        Product("Devslops Hat Black","$20","hoodie2"),
        Product("Devslops Hat White","$22","hoodie3"),
        Product("Devslops Hat Snapback","$18","hoodie4")
    )
    val shirts=listOf(
        Product("Devslops shirt Black","$18","shirt01"),
        Product("Devslops Badge light Gray","$20","shirt2"),
        Product("Devslops Hat White","$22","shirt3"),
        Product("Devslops Hat Hustle","$18","shirt4")
    )
}
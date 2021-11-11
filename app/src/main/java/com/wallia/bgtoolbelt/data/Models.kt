package com.wallia.bgtoolbelt.data.data

import com.tickaroo.tikxml.annotation.Attribute
import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Xml(name = "items")
data class Root(
    @Attribute(name = "termsofuse")
    var termsofuse:String?,
    @Element(name = "item")
    var item:List<Thing>?

)

@Xml
data class Thing(
    @Attribute(name = "type")
    var type:String?,
    @Attribute(name = "id")
    var id:String?,
    @PropertyElement(name = "thumbnail")
    var thumbnail:String?,
    @PropertyElement(name = "image")
    var image:String?,
    @Element(name = "name")
    var nameList:List<BoardGameName>?,
    @Element(name = "yearpublished")
    var year:BoardGameYear?,
    @PropertyElement(name = "description")
    var description:String?,
    @Element(name = "link")
    var propertyList:List<BoardGameProperty>?
)


@Xml
data class BoardGameName(

    @Attribute(name = "type")
    var type:String?,
    @Attribute(name = "sortindex")
    var sortIndex:String?,
    @Attribute(name = "value")
    var value:String?


    )

@Xml
data class BoardGameYear(

    @Attribute(name = "value")
    var value:String?
)

@Xml
data class BoardGameProperty(
    @Attribute(name = "type")
    var type:String?,
    @Attribute(name = "id")
    var id:String?,
    @Attribute(name = "value")
    var value:String?
)
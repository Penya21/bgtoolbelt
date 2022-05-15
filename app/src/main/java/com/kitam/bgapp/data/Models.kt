package com.kitam.bgapp.data.data

import androidx.appcompat.graphics.drawable.DrawableWrapper
import androidx.room.*
import androidx.room.ColumnInfo.VALUE_UNSPECIFIED
import com.google.android.gms.maps.model.LatLng
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken
import com.tickaroo.tikxml.annotation.Attribute
import com.tickaroo.tikxml.annotation.Element
import org.json.JSONObject
import java.util.*

data class Root(
    @Attribute(name = "termsofuse")
    var termsofuse:String?,
    @Element(name = "item")
    var item:List<BoardGame>?

)

@Entity(tableName = "boardgame_entity")
data class BoardGame(
    @PrimaryKey
    var id:String = "",
    var type:String? = "",
    var imageurl:String? = "",
    var name:String? = "",
    var yearpublished:String? = "",
    var description:String? = "",
    var rank:String? = "",
    var href:String? = "",
    @Ignore
    var isAd: Boolean? = false

)

@Entity(tableName = "user_entity")
data class User(
    @PrimaryKey
    var email:String,
    @ColumnInfo(name = "name", defaultValue = VALUE_UNSPECIFIED)
    var name:String?,
    @ColumnInfo(name = "phone", defaultValue = VALUE_UNSPECIFIED)
    var phone:String?,
    @ColumnInfo(name = "hotList", defaultValue = VALUE_UNSPECIFIED)
    var hotList: List<BoardGame>?,
    @ColumnInfo(name = "upcomingList", defaultValue = VALUE_UNSPECIFIED)
    var upcomingList: List<BoardGame>?,
    @ColumnInfo(name = "favList", defaultValue = VALUE_UNSPECIFIED)
    var favList: List<BoardGame>?,
    @ColumnInfo(name = "topList", defaultValue = VALUE_UNSPECIFIED)
    var topList: List<BoardGame>?,
    @ColumnInfo(name = "sponsoredList", defaultValue = VALUE_UNSPECIFIED)
    var sponsoredList: List<BoardGame>?,
    @ColumnInfo(name = "lastUpdate", defaultValue = VALUE_UNSPECIFIED)
    var lastUpdate: Long?

    )

@Entity(primaryKeys = ["email", "id"])
data class UserBoardGameCrossRef(
    val email: String,
    val id: String

)

data class UserFavBoardGames(
    @Embedded val user: User,
    @Relation(
        parentColumn = "email",
        entityColumn = "id",
        associateBy = Junction(UserBoardGameCrossRef::class)
    )
    val boardGames: List<BoardGame>
)

data class BoardGameName(

    @Attribute(name = "type")
    var type:String?,
    @Attribute(name = "sortindex")
    var sortIndex:String?,
    @Attribute(name = "value")
    var value:String?


    )


class BoardGameTypeConverter {
    private val gson = Gson()
    @TypeConverter
    fun stringToList(data: String?): List<BoardGame>? {
        if (data == null) {
            return Collections.emptyList()
        }

        val listType = object : TypeToken<List<BoardGame?>>() {

        }.type

        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun listToString(someObjects: List<BoardGame>?): String {
        return gson.toJson(someObjects)
    }
}

class BoardGameNameTypeConverter {
    private val gson = Gson()
    @TypeConverter
    fun stringToList(data: String?): List<BoardGameName>? {
        if (data == null) {
            return Collections.emptyList()
        }

        val listType = object : TypeToken<List<BoardGameName?>>() {

        }.type

        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun listToString(someObjects: List<BoardGameName>?): String {
        return gson.toJson(someObjects)
    }
}

data class BoardGameYear(

    @Attribute(name = "value")
    var value:String?
)

data class ResponseBoardGamesLists(

    var comingsoon:List<BoardGame>?,
    var hotness:List<BoardGame>?
)


class BoardGameYearTypeConverter {
    private val gson = Gson()
    @TypeConverter
    fun fromSource(source: BoardGameYear?): String? {
        return JSONObject().apply {
            put("value", source?.value)
        }.toString()
    }

    @TypeConverter
    fun toSource(source: String?): BoardGameYear {
        val json = JSONObject(source)
        return BoardGameYear(json.getString("value"))
    }
}


data class Thumbnail(

    @Attribute(name = "value")
    var value:String?

)

class ThumbnailTypeConverter {
    private val gson = Gson()
    @TypeConverter
    fun fromThumbnail(thumbnail: Thumbnail?): String {
        return JSONObject().apply {
            put("value", thumbnail?.value)
        }.toString()
    }

    @TypeConverter
    fun toThumbnail(thumbnail: String?): Thumbnail? {
        val json = JSONObject(thumbnail)
        try {
            return Thumbnail(json.getString("value"))
        }catch (e:Exception){
            return null
        }
    }
}


data class BoardGameProperty(
    @Attribute(name = "type")
    var type:String?,
    @Attribute(name = "id")
    var id:String?,
    @Attribute(name = "value")
    var value:String?
)


class BoardGamePropertyTypeConverter {
    private val gson = Gson()
    @TypeConverter
    fun stringToList(data: String?): List<BoardGameProperty>? {
        if (data == null) {
            return Collections.emptyList()
        }

        val listType = object : TypeToken<List<BoardGameProperty?>>() {

        }.type

        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun listToString(someObjects: List<BoardGameProperty>?): String {
        return gson.toJson(someObjects)
    }


}

//BoardGameDetail

data class BoardGameDetail (

    @SerializedName("item" ) var item : Item? = Item()

)

data class Best (

    @SerializedName("min" ) var min : Int? = null,
    @SerializedName("max" ) var max : Int? = null

)

data class Recommended (

    @SerializedName("min" ) var min : Int? = null,
    @SerializedName("max" ) var max : Int? = null

)

data class Userplayers (

    @SerializedName("best"        ) var best        : ArrayList<Best>        = arrayListOf(),
    @SerializedName("recommended" ) var recommended : ArrayList<Recommended> = arrayListOf(),
    @SerializedName("totalvotes"  ) var totalvotes  : String?                = null

)

data class Boardgameweight (

    @SerializedName("averageweight" ) var averageweight : Double? = null,
    @SerializedName("votes"         ) var votes         : String? = null

)

data class Polls (

    @SerializedName("userplayers"        ) var userplayers        : Userplayers?     = Userplayers(),
    @SerializedName("playerage"          ) var playerage          : String?          = null,
    @SerializedName("languagedependence" ) var languagedependence : String?          = null,
    @SerializedName("subdomain"          ) var subdomain          : String?          = null,
    @SerializedName("boardgameweight"    ) var boardgameweight    : Boardgameweight? = Boardgameweight()

)


data class Stats (

    @SerializedName("usersrated"          ) var usersrated          : String? = null,
    @SerializedName("average"             ) var average             : String? = null,
    @SerializedName("baverage"            ) var baverage            : String? = null,
    @SerializedName("stddev"              ) var stddev              : String? = null,
    @SerializedName("avgweight"           ) var avgweight           : String? = null,
    @SerializedName("numweights"          ) var numweights          : String? = null,
    @SerializedName("numgeeklists"        ) var numgeeklists        : String? = null,
    @SerializedName("numtrading"          ) var numtrading          : String? = null,
    @SerializedName("numwanting"          ) var numwanting          : String? = null,
    @SerializedName("numwish"             ) var numwish             : String? = null,
    @SerializedName("numowned"            ) var numowned            : String? = null,
    @SerializedName("numprevowned"        ) var numprevowned        : String? = null,
    @SerializedName("numcomments"         ) var numcomments         : String? = null,
    @SerializedName("numwishlistcomments" ) var numwishlistcomments : String? = null,
    @SerializedName("numhasparts"         ) var numhasparts         : String? = null,
    @SerializedName("numwantparts"        ) var numwantparts        : String? = null,
    @SerializedName("views"               ) var views               : String? = null,
    @SerializedName("playmonth"           ) var playmonth           : String? = null,
    @SerializedName("numplays"            ) var numplays            : String? = null,
    @SerializedName("numplays_month"      ) var numplaysMonth       : String? = null,
    @SerializedName("numfans"             ) var numfans             : Int?    = null

)

data class Relatedcounts (

    @SerializedName("news"    ) var news    : Int? = null,
    @SerializedName("blogs"   ) var blogs   : Int? = null,
    @SerializedName("weblink" ) var weblink : Int? = null,
    @SerializedName("podcast" ) var podcast : Int? = null

)

data class Primaryname (

    @SerializedName("nameid"      ) var nameid      : String? = null,
    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("sortindex"   ) var sortindex   : String? = null,
    @SerializedName("primaryname" ) var primaryname : String? = null,
    @SerializedName("translit"    ) var translit    : String? = null

)

data class Website (

    @SerializedName("url"   ) var url   : String? = null,
    @SerializedName("title" ) var title : String? = null

)

data class Images (

    @SerializedName("thumb"        ) var thumb        : String? = null,
    @SerializedName("micro"        ) var micro        : String? = null,
    @SerializedName("square"       ) var square       : String? = null,
    @SerializedName("squarefit"    ) var squarefit    : String? = null,
    @SerializedName("tallthumb"    ) var tallthumb    : String? = null,
    @SerializedName("previewthumb" ) var previewthumb : String? = null,
    @SerializedName("square200"    ) var square200    : String? = null

)

data class Square100 (

    @SerializedName("src"    ) var src    : String? = null,
    @SerializedName("src@2x" ) var src2x : String? = null

)

data class Mediacard (

    @SerializedName("src"    ) var src    : String? = null,
    @SerializedName("src@2x" ) var src2x : String? = null

)

data class ImageSets (

    @SerializedName("square100" ) var square100 : Square100? = Square100(),
    @SerializedName("mediacard" ) var mediacard : Mediacard? = Mediacard()

)

data class Language (

    @SerializedName("name" ) var name : String? = null,
    @SerializedName("id"   ) var id   : String? = null,
    @SerializedName("type" ) var type : String? = null

)

data class Source (

    @SerializedName("type" ) var type : String? = null,
    @SerializedName("id"   ) var id   : String? = null

)

data class Video (

    @SerializedName("host" ) var host : String? = null,
    @SerializedName("id"   ) var id   : String? = null

)

data class VideoLinks (

    @SerializedName("rel" ) var rel : String? = null,
    @SerializedName("uri" ) var uri : String? = null

)


data class PlaythroughVideo (

    @SerializedName("id"                         ) var id                         : String?          = null,
    @SerializedName("type"                       ) var type                       : String?          = null,
    @SerializedName("videoid"                    ) var videoid                    : Int?             = null,
    @SerializedName("title"                      ) var title                      : String?          = null,
    @SerializedName("description"                ) var description                : String?          = null,
    @SerializedName("descriptionXml"             ) var descriptionXml             : String?          = null,
    @SerializedName("postdate"                   ) var postdate                   : String?          = null,
    @SerializedName("gallery"                    ) var gallery                    : String?          = null,
    @SerializedName("submitter"                  ) var submitter                  : Int?             = null,
    @SerializedName("hidden"                     ) var hidden                     : Boolean?         = null,
    @SerializedName("blocks_ads"                 ) var blocksAds                  : Boolean?         = null,
    @SerializedName("language"                   ) var language                   : Language?        = Language(),
    @SerializedName("source"                     ) var source                     : Source?          = Source(),
    @SerializedName("featured"                   ) var featured                   : Boolean?         = null,
    @SerializedName("featuredPlacementSponsored" ) var featuredPlacementSponsored : Boolean?         = null,
    @SerializedName("video"                      ) var video                      : Video?           = Video(),
    @SerializedName("href"                       ) var href                       : String?          = null,
    @SerializedName("canonical_link"             ) var canonicalLink              : String?          = null,
    @SerializedName("browse_href"                ) var browseHref                 : String?          = null,
    @SerializedName("links"                      ) var links                      : ArrayList<VideoLinks> = arrayListOf()

)

data class SummaryVideo (

    @SerializedName("id"                         ) var id                         : String?          = null,
    @SerializedName("type"                       ) var type                       : String?          = null,
    @SerializedName("videoid"                    ) var videoid                    : Int?             = null,
    @SerializedName("title"                      ) var title                      : String?          = null,
    @SerializedName("description"                ) var description                : String?          = null,
    @SerializedName("descriptionXml"             ) var descriptionXml             : String?          = null,
    @SerializedName("postdate"                   ) var postdate                   : String?          = null,
    @SerializedName("gallery"                    ) var gallery                    : String?          = null,
    @SerializedName("submitter"                  ) var submitter                  : Int?             = null,
    @SerializedName("hidden"                     ) var hidden                     : Boolean?         = null,
    @SerializedName("blocks_ads"                 ) var blocksAds                  : Boolean?         = null,
    @SerializedName("language"                   ) var language                   : Language?        = Language(),
    @SerializedName("source"                     ) var source                     : Source?          = Source(),
    @SerializedName("featured"                   ) var featured                   : Boolean?         = null,
    @SerializedName("featuredPlacementSponsored" ) var featuredPlacementSponsored : Boolean?         = null,
    @SerializedName("video"                      ) var video                      : Video?           = Video(),
    @SerializedName("href"                       ) var href                       : String?          = null,
    @SerializedName("canonical_link"             ) var canonicalLink              : String?          = null,
    @SerializedName("browse_href"                ) var browseHref                 : String?          = null,
    @SerializedName("links"                      ) var links                      : ArrayList<Links> = arrayListOf()

)

data class Rankinfo (

    @SerializedName("prettyname"          ) var prettyname          : String? = null,
    @SerializedName("shortprettyname"     ) var shortprettyname     : String? = null,
    @SerializedName("veryshortprettyname" ) var veryshortprettyname : String? = null,
    @SerializedName("subdomain"           ) var subdomain           : String? = null,
    @SerializedName("rankobjecttype"      ) var rankobjecttype      : String? = null,
    @SerializedName("rankobjectid"        ) var rankobjectid        : Int?    = null,
    @SerializedName("rank"                ) var rank                : String? = null,
    @SerializedName("baverage"            ) var baverage            : String? = null

)


data class Links (

    @SerializedName("boardgamedesigner"        ) var boardgamedesigner        : ArrayList<Boardgamedesigner>        = arrayListOf(),
    @SerializedName("boardgamesolodesigner"    ) var boardgamesolodesigner    : ArrayList<Boardgamesolodesigner>    = arrayListOf(),
    @SerializedName("boardgameartist"          ) var boardgameartist          : ArrayList<Boardgameartist>          = arrayListOf(),
    @SerializedName("boardgamepublisher"       ) var boardgamepublisher       : ArrayList<Boardgamepublisher>       = arrayListOf(),
    @SerializedName("boardgamegraphicdesigner" ) var boardgamegraphicdesigner : ArrayList<Boardgamegraphicdesigner> = arrayListOf(),
    @SerializedName("boardgamehonor"           ) var boardgamehonor           : ArrayList<Boardgamehonor>           = arrayListOf(),
    @SerializedName("boardgamecategory"        ) var boardgamecategory        : ArrayList<Boardgamecategory>        = arrayListOf(),
    @SerializedName("boardgamemechanic"        ) var boardgamemechanic        : ArrayList<Boardgamemechanic>        = arrayListOf(),
    @SerializedName("boardgameexpansion"       ) var boardgameexpansion       : ArrayList<Boardgameexpansion>       = arrayListOf(),
    @SerializedName("boardgameversion"         ) var boardgameversion         : ArrayList<Boardgameversion>         = arrayListOf(),


)

data class Boardgameversion (

    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("objecttype"  ) var objecttype  : String? = null,
    @SerializedName("objectid"    ) var objectid    : String? = null,
    @SerializedName("primarylink" ) var primarylink : Int?    = null,
    @SerializedName("itemstate"   ) var itemstate   : String? = null,
    @SerializedName("href"        ) var href        : String? = null

)


data class Boardgameexpansion (

    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("objecttype"  ) var objecttype  : String? = null,
    @SerializedName("objectid"    ) var objectid    : String? = null,
    @SerializedName("primarylink" ) var primarylink : Int?    = null,
    @SerializedName("itemstate"   ) var itemstate   : String? = null,
    @SerializedName("href"        ) var href        : String? = null

)

data class Boardgamecategory (

    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("objecttype"  ) var objecttype  : String? = null,
    @SerializedName("objectid"    ) var objectid    : String? = null,
    @SerializedName("primarylink" ) var primarylink : Int?    = null,
    @SerializedName("itemstate"   ) var itemstate   : String? = null,
    @SerializedName("href"        ) var href        : String? = null

)

data class Boardgamedesigner (

    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("objecttype"  ) var objecttype  : String? = null,
    @SerializedName("objectid"    ) var objectid    : String? = null,
    @SerializedName("primarylink" ) var primarylink : Int?    = null,
    @SerializedName("itemstate"   ) var itemstate   : String? = null,
    @SerializedName("href"        ) var href        : String? = null

)

data class Boardgamesolodesigner (

    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("objecttype"  ) var objecttype  : String? = null,
    @SerializedName("objectid"    ) var objectid    : String? = null,
    @SerializedName("primarylink" ) var primarylink : Int?    = null,
    @SerializedName("itemstate"   ) var itemstate   : String? = null,
    @SerializedName("href"        ) var href        : String? = null

)

data class Boardgameartist (

    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("objecttype"  ) var objecttype  : String? = null,
    @SerializedName("objectid"    ) var objectid    : String? = null,
    @SerializedName("primarylink" ) var primarylink : Int?    = null,
    @SerializedName("itemstate"   ) var itemstate   : String? = null,
    @SerializedName("href"        ) var href        : String? = null

)

data class Boardgamepublisher (

    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("objecttype"  ) var objecttype  : String? = null,
    @SerializedName("objectid"    ) var objectid    : String? = null,
    @SerializedName("primarylink" ) var primarylink : Int?    = null,
    @SerializedName("itemstate"   ) var itemstate   : String? = null,
    @SerializedName("href"        ) var href        : String? = null

)

data class Boardgamegraphicdesigner (

    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("objecttype"  ) var objecttype  : String? = null,
    @SerializedName("objectid"    ) var objectid    : String? = null,
    @SerializedName("primarylink" ) var primarylink : Int?    = null,
    @SerializedName("itemstate"   ) var itemstate   : String? = null,
    @SerializedName("href"        ) var href        : String? = null

)

data class Boardgamehonor (

    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("objecttype"  ) var objecttype  : String? = null,
    @SerializedName("objectid"    ) var objectid    : String? = null,
    @SerializedName("primarylink" ) var primarylink : Int?    = null,
    @SerializedName("itemstate"   ) var itemstate   : String? = null,
    @SerializedName("href"        ) var href        : String? = null

)


data class Boardgamemechanic (

    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("objecttype"  ) var objecttype  : String? = null,
    @SerializedName("objectid"    ) var objectid    : String? = null,
    @SerializedName("primarylink" ) var primarylink : Int?    = null,
    @SerializedName("itemstate"   ) var itemstate   : String? = null,
    @SerializedName("href"        ) var href        : String? = null

)

data class Item (

    @SerializedName("subtypename"           ) var subtypename          : String?           = null,
    @SerializedName("polls"                 ) var polls                : Polls?            = Polls(),
    @SerializedName("stats"                 ) var stats                : Stats?            = Stats(),
    @SerializedName("relatedcounts"         ) var relatedcounts        : Relatedcounts?    = Relatedcounts(),
    @SerializedName("itemid"                ) var itemid               : Int?              = null,
    @SerializedName("objecttype"            ) var objecttype           : String?           = null,
    @SerializedName("objectid"              ) var objectid             : Int?              = null,
    @SerializedName("label"                 ) var label                : String?           = null,
    @SerializedName("labelpl"               ) var labelpl              : String?           = null,
    @SerializedName("type"                  ) var type                 : String?           = null,
    @SerializedName("id"                    ) var id                   : String?           = null,
    @SerializedName("href"                  ) var href                 : String?           = null,
    @SerializedName("subtype"               ) var subtype              : String?           = null,
    @SerializedName("subtypes"              ) var subtypes             : ArrayList<String> = arrayListOf(),
    @SerializedName("name"                  ) var name                 : String?           = null,
    @SerializedName("alternatename"         ) var alternatename        : String?           = null,
    @SerializedName("yearpublished"         ) var yearpublished        : String?           = null,
    @SerializedName("minplayers"            ) var minplayers           : String?           = null,
    @SerializedName("maxplayers"            ) var maxplayers           : String?           = null,
    @SerializedName("minplaytime"           ) var minplaytime          : String?           = null,
    @SerializedName("maxplaytime"           ) var maxplaytime          : String?           = null,
    @SerializedName("minage"                ) var minage               : String?           = null,
    @SerializedName("override_rankable"     ) var overrideRankable     : Int?              = null,
    @SerializedName("targetco_url"          ) var targetcoUrl          : String?           = null,
    @SerializedName("shopify_store_url"     ) var shopifyStoreUrl      : String?           = null,
    @SerializedName("walmart_id"            ) var walmartId            : String?           = null,
    @SerializedName("instructional_videoid" ) var instructionalVideoid : String?           = null,
    @SerializedName("summary_videoid"       ) var summaryVideoid       : String?           = null,
    @SerializedName("playthrough_videoid"   ) var playthroughVideoid   : String?           = null,
    @SerializedName("focus_videoid"         ) var focusVideoid         : String?           = null,
    @SerializedName("howtoplay_videoid"     ) var howtoplayVideoid     : String?           = null,
    @SerializedName("bggstore_product"      ) var bggstoreProduct      : String?           = null,
    @SerializedName("short_description"     ) var shortDescription     : String?           = null,
    @SerializedName("secondarynamescount"   ) var secondarynamescount  : Int?              = null,
    @SerializedName("alternatenamescount"   ) var alternatenamescount  : Int?              = null,
    @SerializedName("primaryname"           ) var primaryname          : Primaryname?      = Primaryname(),
    @SerializedName("description"           ) var description          : String?           = null,
    @SerializedName("wiki"                  ) var wiki                 : String?           = null,
    @SerializedName("website"               ) var website              : Website?          = Website(),
    @SerializedName("imageid"               ) var imageid              : String?           = null,
    @SerializedName("images"                ) var images               : Images?           = Images(),
    @SerializedName("imagepagehref"         ) var imagepagehref        : String?           = null,
    @SerializedName("imageurl"              ) var imageurl             : String?           = null,
    @SerializedName("topimageurl"           ) var topimageurl          : String?           = null,
    @SerializedName("imageSets"             ) var imageSets            : ImageSets?        = ImageSets(),
    @SerializedName("itemstate"             ) var itemstate            : String?           = null,
    @SerializedName("playthrough_video"     ) var playthroughVideo     : PlaythroughVideo? = PlaythroughVideo(),
    @SerializedName("links"                 ) var links                : Links?                   = Links(),
    @SerializedName("rankinfo"              ) var rankinfo             : ArrayList<Rankinfo>      = arrayListOf(),
    @SerializedName("summary_video"         ) var summaryVideo         : SummaryVideo?     = SummaryVideo()

)

data class RequestBoardGameDetail(
    var gameId: String?
)

data class RequestProductsInStoresByName(
    var keyword: String?
)

data class Product(
    var storeName: String?,
    var productName: String?,
    var productRef: String?,
    var productImage: String?,
    var price: Number?,
    var priceText: String?
)

data class Store(
    var coordinates: LatLng,
    var name: String,
    var website: String?,
    var logo: Int
)
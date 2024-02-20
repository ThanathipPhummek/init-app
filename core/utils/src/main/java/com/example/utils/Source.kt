package com.example.utils

import java.util.UUID

data class Source(
    var bundleName:String? = null,
    var bundleId:String? = null,
    var style:String? = null,
    var permission:String? = null,
    var permissionConfig:String? = null,
    var action:String? = null
)
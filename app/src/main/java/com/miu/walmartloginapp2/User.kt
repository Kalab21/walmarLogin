package com.miu.walmartloginapp2

import java.io.Serializable

class User(val firstname : String, val lastname : String, val username: String, val password : String) :
    Serializable  {
}
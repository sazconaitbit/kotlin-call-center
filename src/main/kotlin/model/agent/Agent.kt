package model.agent

import model.call.Call

interface Agent {
    fun answer(call: Call)
}
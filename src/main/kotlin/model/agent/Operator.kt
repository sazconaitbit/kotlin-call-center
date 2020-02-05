package model.agent

import model.agent.type.EmployeeType
import model.call.Call

class Operator(name: String, lastName: String, type: EmployeeType) : Employee(name, lastName, type) {

    override fun answer(call: Call) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
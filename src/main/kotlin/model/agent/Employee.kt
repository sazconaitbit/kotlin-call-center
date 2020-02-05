package model.agent

import model.agent.type.EmployeeState
import model.agent.type.EmployeeType
import java.util.*

abstract class Employee : Agent {
    val id = UUID.randomUUID();
    var name: String
    var lastName: String
    val type: EmployeeType
    val state = EmployeeState.AVAILABLE

    constructor(name: String, lastName: String, type: EmployeeType) {
        this.name = name
        this.lastName = lastName
        this.type = type
    }
}
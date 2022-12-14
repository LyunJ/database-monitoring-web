package com.example.databasemonitoringweb.datasource


class CommandList() {
    companion object {
        var uinstance: CommandList? = null
        fun getInstance(): CommandList{
            if(uinstance == null){
                synchronized(CommandList){
                    if(uinstance == null){
                        uinstance = CommandList()
                    }
                }
            }
            return uinstance!!
        }
    }
    private val commandHash = HashMap<String,Boolean>()

    init {
        initCommandHash();
    }

    private fun initCommandHash() {
        commandHash.put("-DSdriver", true)
        commandHash.put("-DShost", true)
        commandHash.put("-DSusername", true)
        commandHash.put("-DSpassword", true)
    }


    fun getCommandHash(): HashMap<String,Boolean>{
        return commandHash;
    }


}
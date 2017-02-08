package com.thechucklingatom.mtgcollectionmanager.Models

import io.magicthegathering.javasdk.resource.Card
import io.magicthegathering.javasdk.api.CardAPI

/**
 * Created by thechucklingatom on 2/7/2017.
 * @author
 */
class CardModel : BaseModel{

    fun getAllCards() : List<Card>{
        return CardAPI.getAllCards()
    }
}
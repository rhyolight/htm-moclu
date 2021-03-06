package com.github.antidata.model

sealed trait DomainEvent

case class HtmModelCreated(id: String) extends DomainEvent

case class HtmModeledEvent(value: Double, timestamp: String) extends DomainEvent
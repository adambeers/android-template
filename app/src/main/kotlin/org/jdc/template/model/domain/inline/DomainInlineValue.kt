package org.jdc.template.model.domain.inline

import kotlinx.datetime.Instant

@JvmInline
value class IndividualId(val value: String)

@JvmInline
value class HouseholdId(val value: String)

@JvmInline
value class FirstName(val value: String)

@JvmInline
value class LastName(val value: String)

@JvmInline
value class Phone(val value: String)

@JvmInline
value class Email(val value: String)

@JvmInline
value class CreatedTime(val value: Instant)

@JvmInline
value class LastModifiedTime(val value: Instant)

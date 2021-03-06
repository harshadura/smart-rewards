package com.cmr.api.dao.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author rajith
 */
@Configuration
public class MongoDBConfig {

    @Value("${smart.rewards.mongo.host}")
    private String mongoHost;

    @Value("${smart.rewards.mongo.port}")
    private int mongoPort;

    @Value("${smart.rewards.events.database.name}")
    private String eventDatabaseName;

    @Value("${smart.rewards.events.voice.call.collection}")
    private String voiceCallCollectionName;

    @Value("${smart.rewards.events.sms.collection}")
    private String smsEventCollectionName;

    @Value("${smart.rewards.events.activation.collection}")
    private String activationCollectionName;

    @Value("${smart.rewards.events.registration.collection}")
    private String registrationCollectionName;

    @Value("${smart.rewards.user-mgt.user.collection.name}")
    private String userCollectionName;

    @Value("${smart.rewards.campaign.collection}")
    private String campaignCollectionName;

    public String getMongoHost() {
        return mongoHost;
    }

    public int getMongoPort() {
        return mongoPort;
    }

    public String getEventDatabaseName() {
        return eventDatabaseName;
    }

    public String getVoiceCallCollectionName() {
        return voiceCallCollectionName;
    }

    public String getSmsEventCollectionName() {
        return smsEventCollectionName;
    }

    public String getActivationCollectionName() {
        return activationCollectionName;
    }

    public String getRegistrationCollectionName() {
        return registrationCollectionName;
    }

    public String getUserCollectionName() {
        return userCollectionName;
    }

    public String getCampaignCollectionName() {
        return campaignCollectionName;
    }
}

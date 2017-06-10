package com.solidarize.scheduler.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@FeignClient(url = "${solidarize.notification.url}", name = "NotificationClient")
@Component
public interface NotificationClient {

    @RequestMapping(value = "/report", method = POST)
    void createReport();
}

package io.pipecrafts.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventProducerController {

  private final StreamBridge streamBridge;

  @PostMapping
  public void sendMessage(@RequestParam("message") String message) {
    log.info("Sending message: {}", message);
    streamBridge.send("producer-out-0", new Message(message));
  }

}

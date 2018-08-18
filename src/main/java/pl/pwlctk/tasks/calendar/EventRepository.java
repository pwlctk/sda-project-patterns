package pl.pwlctk.tasks.calendar;

import java.util.List;
import java.util.Optional;

public interface EventRepository {
    List<Event> getAllEvents();
    Optional<Event> getNextEvent();
    void addEvent(Event event);
    void saveAllEventsToDisk();
}
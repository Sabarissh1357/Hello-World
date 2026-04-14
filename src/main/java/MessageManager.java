import java.util.*;

public class MessageManager {

    private final Map<Integer, Message> messages = new HashMap<>();

    public void create(Message message) {
        messages.put(message.getId(), message);
    }

    public List<Message> readAll() {
        return new ArrayList<>(messages.values());
    }

    public void update(int id, String newText) {
        if (messages.containsKey(id)) {
            messages.get(id).setText(newText);
        }
    }

    public void delete(int id) {
        messages.remove(id);
    }
}
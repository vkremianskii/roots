package net.kremianskii.roots;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static net.kremianskii.roots.util.Collections.firstOrThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CollectionsTests {
    @Test
    void firstOrThrowThrowsWhenNoSuchElement() {
        var collection = List.of("a");
        assertThrows(NoSuchElementException.class, () -> firstOrThrow(collection, item -> item.equals("b")));
    }
}

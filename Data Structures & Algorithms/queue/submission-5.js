function MyDeque() {
    let head = null;
    let tail = null;

    function isEmpty() {
        return head === null;
    }

    function append(value) {
        const newNode = { value, previous: tail, next: null };
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    function appendleft(value) {
        const newNode = { value, previous: null, next: head };
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            return;
        }
        head.previous = newNode;
        head = newNode;
    }

    function pop() {
        if (isEmpty()) {
            return -1;
        }
        const removedValue = tail.value;
        tail = tail.previous;
        if (tail === null) {
            head = null;
        } else {
            tail.next = null;
        }
        return removedValue;
    }

    function popleft() {
        if (isEmpty()) {
            return -1;
        }
        const removedValue = head.value;
        head = head.next;
        if (head === null) {
            tail = null;
        } else {
            head.previous = null;
        }
        return removedValue;
    }

    return { isEmpty, append, appendleft, pop, popleft };
}
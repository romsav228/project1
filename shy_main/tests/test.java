public class test {

    public class MessageSender {
        public static void main(String[] args) {
            String message = "Я буду с тобой долго долго и никуда не денусь, потому что я люблю тебя";

            for (int i = 0; i < 100; i++) {
                sendMessage(message);
            }
        }

        private static void sendMessage(String message) {
            // Здесь можно добавить логику отправки сообщения,
            // например, вывод в консоль.
            System.out.println(message);
        }
    }
}

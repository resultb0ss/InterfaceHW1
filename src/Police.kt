class Police(name: String, phone: String): ExtrServices(name, phone) {

    override fun getDescriprion() {
        println("Полиция основа в 1920 году в городе Москва")
    }

    override fun serviceInfo() {
        println("Полиция ловит преступников")
    }
}
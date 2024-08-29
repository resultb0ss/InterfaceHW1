abstract class ExtrServices(
    val name: String,
    val phone: String
): Description{

    abstract fun serviceInfo()

    override fun getDescriprion() {
        println("Эта организация основана в 1954 году")
    }
}
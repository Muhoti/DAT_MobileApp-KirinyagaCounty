package ke.co.osl.kirinyagacountyfarmermappingapp.models

data class FarmersResourcesBody(
    val FarmerID: String,
    val TotalAcreage: String,
    val CropAcreage: String,
    val LivestockAcreage: String,
    val IrrigationType: String,
    val FarmOwnership: String
)
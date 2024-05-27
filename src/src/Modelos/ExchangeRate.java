package Modelos;

public record ExchangeRate(
    String result,
    String time_last_update_unix,
    String time_last_update_utc,
    String time_next_update_unix,
    String time_next_update_utc,
    String base_code,
    ConversionRate conversion_rates) {
}

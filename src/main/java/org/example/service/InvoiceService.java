package org.example.service;

import org.example.model.Film;
import org.example.model.Schedule;
import org.example.model.Seat;
import org.example.model.SeatNumberCompositeKey;

public interface InvoiceService {
    Seat getSeatById(SeatNumberCompositeKey seatNumberCompositeKey);
    Schedule findScheduleById(Long idSchedule);
    Film getFilmById(Long idFilm);
}

package com.MiniProject.daos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.MiniProject.models.*;
@Repository
public interface BookingRepository  extends JpaRepository<Booking,Long> {

}
